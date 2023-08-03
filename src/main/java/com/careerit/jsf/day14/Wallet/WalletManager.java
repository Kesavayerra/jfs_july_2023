package com.careerit.jsf.day14.Wallet;

public class WalletManager {
    public static void main(String[] args) {
        WalletService walletService = new WalletService();
        walletService.showWalletInfo();
        System.out.println("-".repeat(100));
        walletService.showWalletTransactionsInfo();
    }
}
