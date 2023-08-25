object  Question03 extends  App{
  class Accounts(name:String,balance:Int){
    var Name:String=name
    var Balance:Int=balance

    val Deposit=(amount:Int)=>{
      println(s"${Name}'s Current balance (before depositing) = ${Balance}")
      Balance=Balance+amount
      println(s"${Name}'s Current balance (after deposit ${amount}) = ${Balance}")
    }

    val Withdraw=(amount:Int)=>{
      println(s"${Name}'s Current balance (before withdrawing) = ${Balance}")
      Balance=Balance-amount
      println(s"${Name}'s Current balance (after withdrawing ${amount}) = ${Balance}")
    }

    val Transfer=(amount:Int , receiver:Accounts)=>{
      println(s"${Name}'s Current balance (before transfer) = ${Balance}")
      println(s"${receiver.Name}'s Current balance (before receive) = ${receiver.Balance}")
      Balance=Balance-amount
      receiver.Balance=receiver.Balance+amount
      println(s"${Name}'s Current balance (after transfer ${amount}) = ${Balance}")
      println(s"${receiver.Name}'s Current balance (after receive ${amount}) = ${receiver.Balance}")
    }
  }

    var Account1=new Accounts("Account1",5000)
    var Account2=new Accounts("Account2",5000)
    Account1.Deposit(1000)
    println()
    Account1.Withdraw(500)
    println()
    Account1.Transfer(300,Account2)
}