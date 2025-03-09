// 1. Інтерфейс Print
interface Printer {
    void print(ConsolePrinter.Message message);
}

// 2. Реалізація Printer
class ConsolePrinter implements Printer {
    // Статичний внутрішній клас Message
    public static class Message {
        private final String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
            (message.getSender() == null || message.getSender().isEmpty())) {
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousPrinter.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}

// 3. Головний клас
 class main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        ConsolePrinter.Message msg1 = new ConsolePrinter.Message("Привіт!", "Олена");
        ConsolePrinter.Message msg2 = new ConsolePrinter.Message("Як справи?", "");
        ConsolePrinter.Message msg3 = new ConsolePrinter.Message("", "");

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}


