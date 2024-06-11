package third_session_challenges;

public class ChallengeFive {

    public static void main(String[] args) {

        // +=,-=,*=,/=,%=,<<=, >>=, &=, ^=,|=
        int x = 15, y = 3;
        x += y;
        System.out.println("After x += y, x = " + x);

        x -= y;
        System.out.println("After x -= y, x = " + x);

        x *= y;
        System.out.println("After x *= y, x = " + x);

        x /= y;
        System.out.println("After x /= y, x = " + x);

        x %= y;
        System.out.println("After x %= y, x = " + x);

        x = 15;
            //sa intreb de uilizarea unora operatori
        x &= y;
        System.out.println("After x &= y, x = " + x);

        x = 15;

        x |= y;
        System.out.println("After x |= y, x = " + x);

        x ^= y;
        System.out.println("After x ^= y, x = " + x);

        x = 10;

        x <<= 2;
        System.out.println("After x <<= 2, x = " + x);

        x >>= 2;
        System.out.println("After x >>= 2, x = " + x);

        x >>>= 2;
        System.out.println("After x >>>= 2, x = " + x);

    }
}
