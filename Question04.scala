object Question04 extends App {
  class Accounts(val name: String, val balance: Double) {
    override def toString: String = s"Account($name, $balance)"
  }

  val checkNegative = (list: List[Accounts]) => {
    val out = list.filter(_.balance < 0).map(_.name)
    println(s"Accounts with negative balances: ${out}")
  }

  val getTotal = (list: List[Accounts]) => {
    val out = list.map(_.balance).sum
    println(s"Total balance of all accounts: $out")
  }

  def applyInterestToAccounts(list: List[Accounts]): List[Accounts] = {
    list.map(applyInterest)
  }

  def applyInterest(account: Accounts): Accounts = {
    if (account.balance >= 0)
      new Accounts(account.name, account.balance * 1.05)
    else
      new Accounts(account.name, account.balance * 1.1)
  }

  val list = List(new Accounts("Account1", 100), new Accounts("Account2", -200), new Accounts("Account3", 300))

  checkNegative(list)
  getTotal(list)
  println(applyInterestToAccounts(list))
}