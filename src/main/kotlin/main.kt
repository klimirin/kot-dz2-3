fun main() {
    var priceRub = 20_025;
    var priceKop = 0;

    val minPrice = 1001;
    val minDiscount = 100;

    val maxPrice = 10_001;
    val maxDiscountPercent = 5;

    val meloman = true;
    val melomanDiscountPercent = 1;

    println("������� - $priceRub ������, $priceKop ������ ->");
    if (priceRub >= minPrice) {
        priceRub -= minDiscount;
        println("����� ���������� $minDiscount �������� ������ - $priceRub ������, $priceKop ������");
    }
    if (priceRub >= maxPrice) {
        priceKop += priceRub * 100;
        priceKop -= priceKop * maxDiscountPercent / 100;
        priceRub = priceKop / 100;
        priceKop %= 100;
        println("����� ���������� $maxDiscountPercent% ������ - $priceRub ������, $priceKop ������");
    }
    if (meloman) {
        priceKop += priceRub * 100;
        priceKop -= priceKop * melomanDiscountPercent / 100;
        priceRub = priceKop / 100;
        priceKop %= 100;
        println("����� ���������� $melomanDiscountPercent% ������ - $priceRub ������, $priceKop ������");
    }
}