package academy.devdojo.maratonajava.concorrencia.teste;

import academy.devdojo.maratonajava.concorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.stream.Nodes.collect;

public class CompletableFutureTeste02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncCompletableFuture(storeService);
    }

    public static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2", "Store3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
            .map(storeService::getPriceAsyncCompletableFuture)
            .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));
    }
}
