package Test;

public class NotFoundDevice extends Exception{
    @Override
    public String toString() {
        return "Нема такого серійного номеру,спробуйте ще раз";
    }
}
