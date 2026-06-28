#Write a program to Create bank account system.

account = []

filename = "bankRecord.csv"

try:
    with open (filename, "r") as file:
        for line in file:
            if line.strip():
                acc_number, name, balance = line.rstrip().split(",")
                record = {
                    "Account Number": acc_number,
                    "Name": name,
                    "Balance": float(balance)}
                account.append(record)
except FileNotFoundError:
    pass


while True:
    print("<<--- Bank Account Management System --->>")
    print("1. View Account Details")
    print("2. Open New Accont")
    print("3. Deposite Money")
    print("4. Withdraw Money")
    print("5. Close Account")
    print("6. Exit")

    choice = int(input("Your choice: "))

    if choice == 1:
        if not account:
            print("Bank record is empty!")
        else:
            print("<-- Current Account List  -->")
            for record in account:
                print(f"Account Number:{record['Account Number']} | Name: {record['Name']} | Balance: {record['Balance']}")
            print()

    elif choice == 2:
        print("<-- Opening a new account -->")
        search_acc = input("Enter new account number: ").strip()
        
        acc_exist = None

        for record in account:
            if record["Account Number"] == search_acc:
                acc_exist = record
                break
    
        if acc_exist:
            print("Account no. already exist to someone else")
        else:
            name = input("Applying for new Account. \nEnter name: ").strip()
            balance = float(input("Deposite amount: "))
            new_record = {"Account Number": search_acc, "Name": name, "Balance": balance}
            account.append(new_record)
            print("Successfully created a new account! ")


    elif choice == 3:
        search_acc = input("Enter account number: ").strip()
        
        acc_exist = None

        for record in account:
            if record["Account Number"] == search_acc:
                acc_exist = record
                break

        if acc_exist:
            amount = float(input("Amount to deposite: "))
            acc_exist["Balance"] += amount
            print(f"{amount} is deposited to {acc_exist['Name']}. Total Balance: {acc_exist['Balance']}")
        else:
            print("Account number doesn't exist.")


    elif choice == 4:
        search_acc = input("Enter account number: ").strip()
        
        acc_exist = None

        for record in account:
            if record["Account Number"] == search_acc:
                acc_exist = record
                break

        if acc_exist:
            amount = float(input("Amount want to withdraw: "))
            if amount<=acc_exist["Balance"]:
                acc_exist["Balance"] -= amount
                print(f"{amount} is withdrawn from {acc_exist['Name']}. Remaining Balance: {acc_exist['Balance']}")
            else:
                print("Insufficent Balance in account.")
        else:
            print("Account number doesn't exist.")


    elif choice == 5:
        search_acc = input("Enter account number: ").strip()
        
        acc_exist = None

        for record in account:
            if record["Account Number"] == search_acc:
                acc_exist = record
                break

        if acc_exist:
            account.remove(acc_exist)
            print("Account closed Successfully!")
        else:
            print("Account number doesn't exist.")

    elif choice == 6:
        print("Saving records to Database")
        with open(filename, "w") as file:
            for record in account:
                file.write(f"{record['Account Number']},{record['Name']},{record['Balance']}\n")
            print("Database saved successfully🙂")
            break

    else:
        print("Invalid choice! Please select 1-6.")

    