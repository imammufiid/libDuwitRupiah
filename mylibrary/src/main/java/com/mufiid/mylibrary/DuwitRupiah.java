package com.mufiid.mylibrary;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class DuwitRupiah {

    protected String generate(String nominal) {
        Locale local = new Locale("id", "ID");
        DecimalFormat cursIndonesian = (DecimalFormat) NumberFormat.getCurrencyInstance(local);
        String symbol = Currency.getInstance(local).getSymbol(local);
        cursIndonesian.setPositivePrefix(symbol);

        return cursIndonesian.format(Double.parseDouble(nominal)).toString();
    }
}
