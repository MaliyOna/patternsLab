import Characters.Alhaitham;
import Characters.JunLi;
import Characters.Nahida;
import Characters.Raiden;

public class Main {
    public static void main(String[] args) {
        TeamMediator mediator = new TeamMediator();
        var junLi = new JunLi(mediator);
        var raiden = new Raiden(mediator);
        var nahida  = new Nahida(mediator);
        var alhaitham = new Alhaitham(mediator);

        mediator.AddMember(junLi);
        mediator.AddMember(raiden);
        mediator.AddMember(nahida);
        mediator.AddMember(alhaitham);

        junLi.performSkill();
        System.out.println("\n");
        raiden.performSkill();
        System.out.println("\n");
        nahida.performSkill();
        System.out.println("\n");
        alhaitham.performSkill();
    }
}