#Write a program to Create contact management system.

contact = []
filename = "contactList.csv"

try:
    with open(filename, "r") as file:
        for line in file:
             if line.strip():
                mobile_num, name = line.rstrip().split(",")
                record = {"Mobile Num": mobile_num,
                          "Name": name}
                contact.append(record)

except FileNotFoundError:
    pass

while(True):

    print("<<--- Contacts --->>")
    print("1. View Contacts")
    print("2. Search a Contact")
    print("3. Add a contact")
    print("4. Delete a contact")
    print("5. Exit")

    choice = int(input("Your Choice: "))
    
    if choice == 1:
        print("-- Contact List --")
        if not contact:
            print("No Contact Avilable!")
        else:
            for record in contact:
              print(f"Name: {record['Name']} | Mobile Number: {record['Mobile Num']}")
            print()

    elif choice == 2:
        search_contact = input("Enter name: ").strip()

        contact_found = None

        for record in contact:
            if search_contact == record['Name']:
                contact_found = record
                break
        
        if contact_found:
            print(f"Name: {contact_found['Name']} | Mobile Number: {contact_found['Mobile Num']}")
        else:
            print("Contact not Found!")

    elif choice == 3:
        new_number = input("Enter Mobile number: ").strip()

        contact_found = None

        for record in contact:
            if new_number == record['Mobile Num']:
                contact_found = record
                break
        
        if contact_found:
            print(f"Contact already exist to {record['Name']}")
        else:
            name = input("Enter name: ").strip()
            new_record = {"Mobile Num": new_number,
                          "Name": name}
            contact.append(new_record)

    elif choice == 4:
        delete_contact = input("Enter name: ").strip()

        contact_found = None

        for record in contact:
            if delete_contact == record['Name']:
                contact_found = record
                break
        if contact_found:
            contact.remove(contact_found)
            print("Successfuly deleted.")
        else:
            print("Contact not found!\n")

    elif choice == 5:
        print("--- Saving contacts ---")

        with open(filename, "w") as file:
            for record in contact:
                file.write(f"{record['Mobile Num']}, {record['Name']}\n")
            print("Contact saved successfully!")
        break;

    else:
        print("Invalid choice! Please select 1-5")
