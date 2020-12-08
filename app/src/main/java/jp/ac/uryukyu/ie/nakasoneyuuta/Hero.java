package jp.ac.uryukyu.ie.nakasoneyuuta;

//import sun.print.PeekGraphics;

/**
 * ヒーロークラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    
    /**
     * クラス外からヒーローのHPを取得するためのメソッド
     * 
     * @return hitPoint ヒーローのHP
     */
    public int getHitPoint() {
        return this.hitPoint;
    }

    /**
     * クラス外からヒーローの攻撃力を取得するためのメソッド
     * 
     * @return attack ヒーローの攻撃力
     */
    public int getAttack() {
        return this.attack;
    }

    public Hero(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}