/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.chase22.telegram.webhook;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class App {
    public static void main(String[] args) throws TelegramApiRequestException {
        ApiContextInitializer.init();
        TelegramBotsApi api = new TelegramBotsApi();

        api.registerBot(new EchoBot());
    }
}
