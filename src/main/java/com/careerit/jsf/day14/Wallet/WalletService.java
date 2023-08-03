package com.careerit.jsf.day14.Wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WalletService {
    private List<Wallet> wallets = new ArrayList<>();
    private List<WalletTransactions> walletTransactions = new ArrayList<>();

    public WalletService(){
        wallets = loadWalletDetailsFromFile();
        walletTransactions = loadWalletTransactionsFromFile();

    }

    public void showWalletInfo(){
        for (Wallet wallet:wallets){
            wallet.showWalletInfo();
        }
    }

    public void showWalletTransactionsInfo(){
        for (WalletTransactions walletTransaction:walletTransactions){
            walletTransaction.getWalletTransactionInfo();
        }
    }

   // public void showWalletBalanceAfterTransactions(){

        //}
  //  private double getTransactionAmount(String mobile){
     //   float amount = 0;
     //   for (WalletTransactions wt:WalletTransactions){
     //      // if(wt.getFrom().equals(mobile));

       //     }
       // }
    //}





    private List<Wallet> loadWalletDetailsFromFile(){
        List<Wallet> walletList = new ArrayList<>();

        // to read data from csv file
        Scanner sc = new Scanner(WalletService.class.getResourceAsStream("/wallet.csv"));
        // to skip first line headers from csv file
        sc.nextLine();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] data = line.split(",");
            String id = data[0];
            String name = data[1];
            long mobile = Long.parseLong(data[2]);
            Float balance = Float.parseFloat(data[3]);
            Wallet wallet = new Wallet(id,name,mobile,balance);
            walletList.add(wallet);
        }
        return walletList;
    }

    private List<WalletTransactions> loadWalletTransactionsFromFile(){
        List <WalletTransactions> walletTransactionsList = new ArrayList<>();
        Scanner sc = new Scanner(WalletService.class.getResourceAsStream("/wallet_txn.csv"));
        sc.nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] data = line.split(",");
            long txnId = Long.parseLong(data[0]);
            long from = Long.parseLong(data[1]);
            long to = Long.parseLong(data[2]);
            float balance = Float.parseFloat(data[3]);
            WalletTransactions walletTransactions = new WalletTransactions(txnId,from,to,balance);
            walletTransactionsList.add(walletTransactions);

        }

        return walletTransactionsList;
    }

}
