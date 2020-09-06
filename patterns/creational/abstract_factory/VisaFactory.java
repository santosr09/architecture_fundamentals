package abstract_factory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch(cardType) {
            case GOLD:
                return new VisaGoldCreditCard();

            case PLATINUM:
                return new VisaBlackCreditCard();

        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch(cardType){
            case GOLD :
                return new VisaValidator();
            default :
                return null;
        }

    }

}
