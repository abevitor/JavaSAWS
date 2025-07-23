package keywords.Exercicio1;

abstract class Mensagens {
    protected String mensagem;

    public Mensagens(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract String mandarMensagem();
    
    
}

class Whatsapp extends Mensagens {

    public Whatsapp(String mensagem){
        super(mensagem);
    }

    @Override
    public String mandarMensagem(){
        return "WhatsApp: " + mensagem;
    }

}

class Sms extends Mensagens {
    public Sms(String mensagem){
        super(mensagem);
    }

    @Override
    public String mandarMensagem(){
        return "SMS: " + mensagem;
    }
}

class Email extends Mensagens {
    public Email(String mensagem) {
        super(mensagem);
    }
    
    @Override
    public String mandarMensagem(){
        return "Email: " + mensagem;
    }
}

class RedesSociais extends Mensagens {
    public RedesSociais(String mensagem){
        super(mensagem);
    }

    @Override
    public String mandarMensagem(){
        return "Facebook, Twitter, Instagram: " + mensagem;
    }
}




