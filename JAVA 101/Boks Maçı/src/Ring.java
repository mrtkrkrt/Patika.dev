public class Ring {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight, maxWeight;

    public Ring(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public  void  run(){
        if (isCheckWeight()){
            double luckValue = Math.random()*100;
            do {
                System.out.println("============== NEW ROUND ===============");
                if(luckValue >= 0 && luckValue <= 50){
                    this.fighter2.health = fighter1.hit(fighter2);
                    if (isWin()){
                        break;
                    }
                    this.fighter1.health = fighter2.hit(fighter1);
                    if (isWin()){
                        break;
                    }
                }else {
                    this.fighter1.health = fighter2.hit(fighter1);
                    if (isWin()){
                        break;
                    }

                    this.fighter2.health = fighter1.hit(fighter2);
                    if (isWin()){
                        break;
                    }
                }

                printScore();
            }while (this.fighter1.health > 0 && this.fighter2.health > 0);


        }else {
            System.out.println("Athletes' weights do not match!");
        }

    }

    public void printScore() {
        System.out.println("-------------------");
        System.out.println(fighter1.name + " remaining health \t:" + fighter1.health);
        System.out.println(fighter2.name + " remaining health \t:" + fighter2.health);

    }

    public boolean isWin() {
        if (fighter1.health == 0){
            System.out.println(fighter2.name + " won the match");
            return true;
        }else if (fighter2.health == 0){
            System.out.println(fighter1.name +" won the match");
            return true;
        }
        return false;
    }

    public boolean isCheckWeight() {
        return (fighter1.weight >= minWeight && fighter1.weight <= maxWeight) && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight);
    }
}
