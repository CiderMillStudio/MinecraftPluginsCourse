package com.wady.javabasics4bexercises;

public abstract class Entity {

    public int health;
    public int speed;
    public int damage;

    public Entity(int _health, int _speed, int _damage) {
        this.health = _health;
        this.speed = _speed;
        this.damage = _damage;
    }

    public abstract void moveTowardPlayer();
}
