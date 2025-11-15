import java.util.Scanner;

public class Nokia{
public static void main(String[]args){

menu();
}

public static void menu(){
Scanner input = new Scanner(System.in);

System.out.println("""Welcome to Nokia

List of menu functions;
1.phone book;
2.messages;
3.chat;
4.call Register;
5.tones;
6.settings;
7.call Divert;
8.games; 
9.calculator;
10.reminders;
11.clock;
12.profiles;
13.SIM services;

Choose an option from the 13 above""");

int menu = input.nextInt();

switch(menu){

case 1 -> {System.out.println("Search");}
case 2 -> {System.out.println("Service Nos");}
case 3 -> {System.out.println("Add name");}
case 4 -> {System.out.println("Erase");}
case 5 -> {System.out.println("Edit");}
case 6 -> {System.out.println("Assign tone");}
case 7 -> {System.out.println("Send b'card");}
case 8 -> {
menu = """
-------------options------------
1. Type of view
2. Memory status
--------------------------------
""";
System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch (menu){
case 1 -> {System.out.println("Type of view);}
case 2 -> {System.out.println("Memory status");}
case 3 -> {System.out.println("Choose an option");}
}

}

case 9 -> {System.out.println("Speed dials");}
case 10 -> {System.out.println("Voice tags");}
default -> {System.out.println("Choose an option");}

}


case 2 -> {
menu = """
--------------Messages--------------
1.write messages
2.inbox
3.outbox
4.picture messages 
5.templates
6.smileys
7.message settings
8.info service
9.voice mailbox number
10.service command editor
-------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Write messages");}
case 2 -> {System.out.println("Inbox");}
case 3 -> {System.out.println("Outbox");}
case 4 -> {System.out.println("Picture messages");}
case 5 -> {System.out.println("Templates");}
case 6 -> {System.out.println("Smileys");}
case 7 -> {

menu = """

----------Message settings-------------------
1. Set 1
2. Common
--------------------------------------------
""";

System.out.println("menu");
System.out.print("Choose an option: ");
int menu = input.nextInt();

switch(menu) {

case 1 -> {
menu = """
---------------Set 1-----------------
1. Message centre number
2. Message sent as
3. Message validity
-------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Message centre number");}
case 2 -> {System.out.println("Message sent as");}
case 3 -> {System.out.println("Message validity");}
case 4 -> {System.out.println("Choose an option");}
}

}

case 2 -> {
menu = """
---------------Common-----------------
1. Delivery reports
2. Reply via same centres
3. Character support
-------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {

case 1 -> {System.out.println("Delivery reports");}
case 2 -> {System.out.println("Reply via same centres");}
case 3 -> {System.out.println("Character support");}
case 4 -> {System.out.println("Choose an option");}

}

}

case 4 -> {System.out.println("Choose an option");}
}

case 8 -> {System.out.println("Info service");}
case 9 -> {System.out.println("Voice mailbox number");}
case 10 -> {System.out.println("servie command editor");}
case 4 -> {System.out.println("Choose an option");}
}

}

case 3 -> {System.out.println("Chat");}
case 4 -> {
menu = """
----------------Call register--------------
1.Missed calls
2.Received calls
3.Dialled numbers
4.Erase recent call lists
5.Show call duration
6.Show call costs
7.Call cost settings 
8.Prepaid credit
------------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {

case 1 -> {System.out.println("Missed calls");}
case 2 -> {System.out.println("Recieved calls");}
case 3 -> {System.out.println("Dialled numbers");}
case 4 -> {System.out.println("Erase recent call lists");}
case 5 -> {
menu = """
--------------Show call duration---------------
1.Last call duartion
2.All calls' duration
3.Recived calls' duartion
4.Dialled calls' duration
5.Clear timers
-------------------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Last call duration");}
case 2 -> {System.out.println("All calls' duration");}
case 3 -> {System.out.println("Recived calls' duration");}
case 4 -> {System.out.println("Dialled calls' duration");}
case 5 -> {System.out.println("Clear timers");}
case 6 -> {System.out.println("Choose an option: ");}
}

}

case 6 -> {
menu = """
---------------Show all costs--------------
1.Last call cost
2.All calls' cost
3.Clear counters
-------------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Last call cost");}
case 2 -> {System.out.println("All calls' cost");}
case 3 -> {System.out.println("Clear counters");}
case 4 -> {System.out.println("Choose an option");}
}
}

case 7 -> {
menu = """
--------------Call cost settings---------------
1.Call cost limit
2.Show costs in
-----------------------------------------------
""";
System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Call cost limit");}
case 2 -> {System.out.println("Show costs in");}
case 3 -> {System.out.println("Choose an option");}
}

}
case 8 -> {System.out.println("Prepaid credit");}
}

}

case 5 -> {
menu = """
----------------------Tones------------------------
1.Ringing tone
2.Ringing volume
3.Incoming call alert
4.Composer
5.Message alert tone
6.Keypad tones
7.Warning and games tones
8.Vibrating alert 
9.Screen saver
------------------------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Ringing tone");}
case 2 -> {System.out.println("Ringing volume");}
case 3 -> {System.out.println("Incoming call alert");}
case 4 -> {System.out.println("Composer");}
case 5 -> {System.out.println("Message alert tone");}
case 6 -> {System.out.println("Keypad tones");}
case 7 -> {System.out.println("Warning and games tones");}
case 8 -> {System.out.println("Vibrating alert");}
case 9 -> {System.out.println("Screen saver");}
case 10 -> {System.out.println("Choose an option: ");}
}

}

case 6 -> {
menu = """
-----------------------Settings------------------
1.Call settings
2.phone settings
3.security settings
4.restore factory settings 
--------------------------------------------------
""";
System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {

case 1 -> {

menu = """
------------Call settings----------------------
1.automatic redial
2.speed dialing
3.call waiting options
4.own number sending
5.phone line in use 
6.automatic answer
-------------------------------------------------
""";
System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("automatic redial");}
case 2 -> {System.out.println("speed dialing");}
case 3 -> {System.out.println("call waiting options");}
case 4 -> {System.out.println("own number sending");}
case 5 -> {System.out.println("phone line in use");}
case 6 -> {System.out.println("automatic answer");}
case 7 -> {System.out.println("Choose an option: ");}
}

}

case 2 -> 
menu = """
--------------------Phone settings-----------------
1.language 
2.cell info display
3.welcome note
4.network selection
5.lights
6.confirm SIM service actions
---------------------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("language");}
case 2 -> {System.out.println("cell info display");}
case 3 -> {System.out.println("welcome note");}
case 4 -> {System.out.println("network selection");}
case 5 -> {System.out.println("lights");}
case 6 -> {System.out.println("confirm SIM service actions");}
case 7 -> {System.out.println("Choose an option: ");}
}
}

system.out.print("""Security settings 
1.PIN code request
2.call barring service
3.fixed dialling
4.closed user group
5.phone security
6.change access codes
""");

case 4 -> System.out.print("""Restore factory settings""");
}

}

case 7 -> System.out.print("call divert");
case 8 -> System.out.print("Games");
case9 -> System.out.print("Calculator");
case 10 -> System.out.print("Reminders");
case 11 -> {

menu = """
---------------Clock---------------
1.alarm clock
2.clock settings
3.date settings
4.stopwatch
5.countdown timer 
6.auto update of date and time
--------------------------------------
""";

System.out.println("menu");
System.out.print("Enter an option: ");
int menu = input.nextInt();

switch(menu) {


case 1 -> {System.out.println("Alarm clock");}
case 2 -> {System.out.println("clock settings");}
case 3 -> {System.out.println("date settings);}
case 4 -> {System.out.println("stopwatch");}
case 5 -> {System.out.println("coutdown timer");}
case 6 -> {System.out.println("auto update of date and time");}
case 7 -> {System.out.println("Choose an option: ");}
}

}

case 12 -> {System.out.println("Profiles");}
case 13 -> {System.out.println("SIM services");}




