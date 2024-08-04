package de.kalitrius.pixelpay;

import java.util.HashMap;
import java.util.UUID;

public class pixelPayAPI {

    private HashMap<UUID, Double> balances;

    public pixelPayAPI() {
        balances = new HashMap<>();
    }

    public void setBalance(UUID playerUUID, double amount) {
        balances.put(playerUUID, amount);
    }

    public Double getBalance(UUID playerUUID) {
        return balances.getOrDefault(playerUUID, 0.0);
    }

    public void addMoney(UUID playerUUID, double amount) {
        balances.put(playerUUID, getBalance(playerUUID) + amount);
    }

    public void removeMoney(UUID playerUUID, double amount) {
        balances.put(playerUUID, getBalance(playerUUID) - amount);
    }
}
