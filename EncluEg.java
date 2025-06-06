
class Bank {

    private int bal = 1000;

    private void withdraw(int amt) {
        if (bal > amt) {
            bal = bal - amt;

        }

    }

    private void deposit(int amt) {

        bal = bal + amt;

    }

    public int getBal() {
        return bal;
    }

    public int setBal(int amt, String s) {

        if (s == "w") {

            withdraw(amt);
        } else if (s == "d") {
            deposit(amt);
        } else {
            System.out.println("invalid");
        }

        return bal;

    }

    public void setamt() {
        bal = bal + 500;
    }

}

class EncluEg {

    public static void main(String[] args) {

        Bank c1 = new Bank();

        System.out.println(c1.getBal());
        System.out.println(c1.setBal(300, "d"));
        System.out.println(c1.setBal(1700, "w"));
        // System.out.println(c1.deposit(300));

        // c1.bal = 100000000;
        System.out.println(c1.getBal());

    }

}