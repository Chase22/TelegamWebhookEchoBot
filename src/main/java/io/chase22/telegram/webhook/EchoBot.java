package io.chase22.telegram.webhook;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class EchoBot extends TelegramWebhookBot {
    public EchoBot(DefaultBotOptions options) {
        super(options);
    }

    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {
        if (update.hasMessage()) {
            return new SendMessage(update.getMessage().getChatId(), update.getMessage().getText());
        } else {
            return null;
        }

    }

    @Override
    public String getBotUsername() {
        return System.getenv("BOT_USERNAME");
    }

    @Override
    public String getBotToken() {
        return System.getenv("BOT_TOKEN");
    }

    @Override
    public String getBotPath() {
        return System.getenv("BOT_PATH");
    }
}
