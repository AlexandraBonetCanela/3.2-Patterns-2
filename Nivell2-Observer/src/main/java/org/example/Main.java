package org.example;

public class Main {

    public static void main(String[] args) {

        Observable stockMarketAgent = new Observable();

        StockAgency iTStocksAcademy = new StockAgency("IT Stocks Academy");
        StockAgency indraStocks = new StockAgency("Indra Stocks");

        stockMarketAgent.subscribe(iTStocksAcademy);
        stockMarketAgent.subscribe(indraStocks);

        stockMarketAgent.setMarketState("ES35 is rising");

        stockMarketAgent.setMarketState("ES35 is falling");
        stockMarketAgent.unsubscribe(indraStocks);
    }
}