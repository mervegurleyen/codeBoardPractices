public class SMSMessage {

    public static void main(String[] args) {

        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        String sender, phoneNumber, messageBody;
        sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));


        System.out.println("Sender: " + sender
                + "\nPhone Number: " + phoneNumber
                + "\nMessage body: " + messageBody);

        }
    }

// We have a message variable already declared and assigned value in this format
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//Variables are already declared:
//sender, phoneNumber, messageBody
//by using String methods: retrieve related information from SMSmessage string and assign to those 3 variables.
//-print each variable in separate line
//Sender: Mike Smith
//Phone Number: 202-123-3456
//Message body: I love programing and problem solving