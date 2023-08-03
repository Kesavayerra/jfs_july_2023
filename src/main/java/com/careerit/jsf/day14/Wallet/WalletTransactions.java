package com.careerit.jsf.day14.Wallet;

public class WalletTransactions {

    private long txnId;
    private long from;
    private long to;
    private float amount;

    public WalletTransactions(long txnId, long from, long to, float amount){
        this.txnId = txnId;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void getWalletTransactionInfo(){
        System.out.println("Transaction ID :"+txnId+" From :"+from+" To :"+to+" Amount :"+amount);
    }

    public long getTxnId() {
        return txnId;
    }

    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
