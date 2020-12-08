package jp.ac.uryukyu.ie.nakasoneyuuta;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{


        /**
         * クラス外から敵のHPを取得するためのメソッド
         * @return hitPoint 敵のHP
         */
    public int getHitPoint(){
        return this.hitPoint;
    }

        /**
         * クラス外から敵の攻撃力を取得するためのメソッド
         * @return attack 敵の攻撃力
         */
    public int getAttack(){
        return this.attack;
    }

    public Enemy(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}