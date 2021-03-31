package com.company;

import model.DBModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {

    public enum Command {
        Unknown,
        EXIT,
        GET,
        AddUser,
        POST
    }

    private static HashMap<Command, CommandHandler> commandApp = null;
    private static DBModel model = new DBModel();
    private void AddUser(){
        model.addUser();
    }

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("Hello World!!!!");

        // check if length of args is
        // greater than 0
        if (args.length > 0) {
            System.out.println("The command line arguments are:");

            // iterating the args array and printing
            // the command line arguments
            StringTreatment st = new StringTreatment();
            String[] pathSep = st.delimitString(args[1], "/");
            for (String s : pathSep) {
                System.out.print(s + "\n");
            }


            commandApp = new HashMap<Command, CommandHandler>();

            commandApp.put(Command.AddUser, new CommandHandler() {
                @Override
                public CommandResult execute(CommandRequest commandRequest) {
                    return null;
                }
            });


            /*private void RemoveMonitor(){
                model.removeMonitor();
            }*/


        } else {
            // Enter data using BufferReader (interactive mode)
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String name = reader.readLine();

            // Printing the readLine
            System.out.println(name);

            //Scanner s = new Scanner(System.in);
            //int result = s.nextInt();
            //Command option = Command.values()[result];
        }

    }
}
