package com.musala.javacourse181112.SecondPart.Patterns.AccountWithCompositePattern;

public class AccountComposite {
    protected String name;
    AccountActions behaviour = null;

    public AccountComposite(String name, AccountActions behaviour) {
        this.name = name;
        this.behaviour = behaviour;
    }

    public void runDeposit(){
        if(this.behaviour != null)
            behaviour.deposit();
        else
            System.out.println("deposit not supported");
    }
    public void runWithdraw(){
        if(this.behaviour != null)
            behaviour.withdraw();
        else
            System.out.println("withdraw not supported");
    }
    public void runCharge(){
        if(this.behaviour != null)
            behaviour.charge();
        else
            System.out.println("charge not supported");
    }
    public void runGetBalance(){
        if(this.behaviour != null)
            System.out.println(behaviour.getAccountBalance());
        else
            System.out.println("getAccountBalance not supported");
    }

    public void setBehaviour(AccountActions behaviour){
        this.behaviour = behaviour;
    }
}
