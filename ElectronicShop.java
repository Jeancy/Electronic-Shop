/*
 * Monica wants to buy a keyboard and a USB drive from her favorite electronics store.
 *The store has several models of each. Monica wants to spend as much as possible for the
 *items, given her budget.

 *Given the price lists for the store's keyboards and USB drives, and Monica's budget, 
 *find and print the amount of money Monica will spend. If she doesn't have enough money
 *to both a keyboard and a USB drive, print -1 instead. She will buy only the two required items.

 */
package electronicshop;

/**
 *
 * @author Jeancy Tshibemba
 */
public class ElectronicShop {
    /**
     * 
     * @param keyboards list of keyboard prices
     * @param drives list of usb drive prices
     * @param b the budget to spend
     * @return 
     */

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;
        for(int i  = 0 ; i < keyboards.length ; i++){
            for(int j = 0; j < drives.length ; j++) {

                if(((keyboards[i]+drives[j]) <= b) && (keyboards[i] + drives[j] >= max)){
                    max = keyboards[i] + drives[j];
                }
            }

        }
        if(max !=0 ){
            return max;
        }else{
        return -1;
        }
    }
    public static void main(String[] args) {
        int[] keyb = {3,1};
        int[] sub = {5,2,8};
        int budget = 10;
        getMoneySpent(keyb , sub , budget);
    }
    
}
