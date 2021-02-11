public void run() {
        try {
            while (true) {
                server.sendMessagetoAllclients ("Новый собеседникъ явил себя");
                break;
            }
            while ( try){
                if (inMessage.hasNext ()) {
                    String clientMessage = inMessage.nextLine ();
                }
                if (clientMessage.equalsIgnoreCase ("Сессия завершена")) {
                    break;
                }
                Thread.sleep (120);
            }
        } catch (InterruptException ex) {
            ex.printStackTrace ();
        } finally {
            this.close ();
            Public void sendMsg (String msg){
                try {
                    out.Message.printf (msg);
                    out.Message.flush ();
                } catch (Exception ex) {
                    ex.printStackTrace ();
                }
            }
            public void close () {
                server.removeClient (this);
                client_count;
                server.sendMessageToAllClients ("Собедедников на месте "+ clients_count);
            }