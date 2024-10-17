import java.util.Objects;

public class SmartPhonePrice implements Cloneable{
    String priceType;
    double priceInEuros;

    public SmartPhonePrice(String type, double price){
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhonePrice that = (SmartPhonePrice) o;
        return Double.compare(priceInEuros, that.priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SmartPhonePrice() {
        super();
    }

    @Override
    public String toString() {
        return "SmartPhonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }
}
