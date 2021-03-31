package com.company;

public interface CommandHandler {
    CommandResult execute(CommandRequest commandRequest);
}
