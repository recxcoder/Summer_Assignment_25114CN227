# Library Manangement System

library = []
filename = "libraryRecord.csv"

try:
    with open(filename, "r") as file:
         for line in file:
             if line.strip():
                 name, student_id, issued_book = line.rstrip().split(",")
                 record = {"Name": name, 
                           "ID": student_id,
                           "Book issued": int(issued_book)}
                 library.append(record)
except FileNotFoundError:
    pass

while True:
    print("<<--- Library Management System --->>")
    print("1. View Library Records")
    print("2. Issue a Book")
    print("3. Return a Book")
    print("4. Exit")

    choice = input("Choice: ").strip()
    print()

    if choice == "1":
        if not library:
            print("No library records found!\n")
        else:
            print("<-- Current Borrower Directory -->")
            for record in library:
                print(f"Name: {record['Name']} | ID: {record['ID']} | Books Issued: {record['Book issued']}")

    elif choice == "2":
        search_id = input("Enter Student ID: ").strip()

        student_found = None
        for record in library:
            if record["ID"] == search_id:
                student_found = record
                break

        if student_found:
            student_found["Book issued"] += 1
            print(f"Another book issued to {student_found['Name']}. Total: {student_found['Book issued']}")
        
        else:
            name = input("New Student! Enter Name:").strip()
            issued_book = int(input("Issued books: "))
            new_record = {"Name": name, "ID": search_id, "Book issued": issued_book}
            library.append(new_record)
            print(f"Student profile created and book issued to {name} successfully!")

    elif choice == "3":
        search_id = input("Enter Student ID: ").strip()

        student_found = None
        for record in library:
            if record['ID'] == search_id:
                student_found = record
                break

        if not student_found:
            print("Student is not registered in Records!")
        else:
            student_found["Book issued"] -= 1
            print(f"Book returned successfully by {student_found['Name']}. Remaining Books: {student_found['Book issued']}")
            if student_found["Book issued"] <= 0:
                print(f"All books returned. Removing {student_found['Name']} from active library records.")
                library.remove(student_found)

    elif choice == "4":
        print("Saving records to Database...")
        with open(filename, "w") as file:
            for record in library:
                file.write(f"{record['Name']}, {record['ID']}, {record['Book issued']}\n")
            print("Data saved successfully 🙂!")
            break

    else:
        print("Invalide choice! Please select 1-4.")