import mayflower.*;
public class Player extends Actor{

	private Double money;
	public Player()
	{
		money = 0.0;
	}
	public Double getMoney()
	{
		return money;
	}
	public void moreMoney(Double amount)
	{
		money += amount;
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}