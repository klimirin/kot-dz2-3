fun main() {
    var priceRub = 20_025;
    var priceKop = 0;

    val minPrice = 1001;
    val minDiscount = 100;

    val maxPrice = 10_001;
    val maxDiscountPercent = 5;

    val meloman = true;
    val melomanDiscountPercent = 1;

    println("покупка - $priceRub рублей, $priceKop копеек ->");
    if (priceRub >= minPrice) {
        priceRub -= minDiscount;
        println("после применения $minDiscount рублевой скидки - $priceRub рублей, $priceKop копеек");
    }
    if (priceRub >= maxPrice) {
        priceKop += priceRub * 100;
        priceKop -= priceKop * maxDiscountPercent / 100;
        priceRub = priceKop / 100;
        priceKop %= 100;
        println("после применения $maxDiscountPercent% скидки - $priceRub рублей, $priceKop копеек");
    }
    if (meloman) {
        priceKop += priceRub * 100;
        priceKop -= priceKop * melomanDiscountPercent / 100;
        priceRub = priceKop / 100;
        priceKop %= 100;
        println("после применения $melomanDiscountPercent% скидки - $priceRub рублей, $priceKop копеек");
    }
}