public class FriendsPairing{
    public static int friendsPairing(int n){
        if(n==1 || n==2) return n;
        //choices
        //single
        int fnm1=friendsPairing(n-1);
        //pair
        int fnm2=friendsPairing(n-2);
        int pairingWays=(n-1) * fnm2;

        //total Ways
        int totalWays=fnm1 + pairingWays;
        return totalWays; 
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
}