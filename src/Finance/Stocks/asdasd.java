package Finance.Stocks;

/**
 * Created by Admin on 13.07.2016.
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class asdasd {
    public static void main(String[] args) {
        String response = "" +
                "{\n" +
                "   \"count\": 3132,\n" +
                "   \"unread_dialogs\": 41,\n" +
                "   \"items\": [{\n" +
                "               \"unread\": 1,\n" +
                "               \"message\": {\n" +
                "                   \"id\": 360658,\n" +
                "                   \"date\": 1394122091,\n" +
                "                   \"out\": 0,\n" +
                "                   \"user_id\": 85635407,\n" +
                "                   \"read_state\": 0,\n" +
                "                   \"title\": \"...\",\n" +
                "                   \"body\": \"hey\"\n" +
                "               }\n" +
                "           }]\n" +
                "}";


        String response2 = "{\n" +
                " \"query\": {\n" +
                "  \"count\": 1,\n" +
                "  \"created\": \"2016-07-16T08:40:27Z\",\n" +
                "  \"lang\": \"en-US\",\n" +
                "  \"diagnostics\": {\n" +
                "   \"url\": [\n" +
                "    {\n" +
                "     \"execution-start-time\": \"0\",\n" +
                "     \"execution-stop-time\": \"1\",\n" +
                "     \"execution-time\": \"1\",\n" +
                "     \"content\": \"http://www.datatables.org/yahoo/finance/yahoo.finance.quotes.xml\"\n" +
                "    },\n" +
                "    {\n" +
                "     \"execution-start-time\": \"5\",\n" +
                "     \"execution-stop-time\": \"6\",\n" +
                "     \"execution-time\": \"1\",\n" +
                "     \"content\": \"http://download.finance.yahoo.com/d/quotes.csv?f=aa2bb2b3b4cc1c3c4c6c8dd1d2ee1e7e8e9ghjkg1g3g4g5g6ii5j1j3j4j5j6k1k2k4k5ll1l2l3mm2m3m4m5m6m7m8nn4opp1p2p5p6qrr1r2r5r6r7ss1s7t1t7t8vv1v7ww1w4xy&s=YHOO\"\n" +
                "    }\n" +
                "   ],\n" +
                "   \"publiclyCallable\": \"true\",\n" +
                "   \"cache\": {\n" +
                "    \"execution-start-time\": \"4\",\n" +
                "    \"execution-stop-time\": \"4\",\n" +
                "    \"execution-time\": \"0\",\n" +
                "    \"method\": \"GET\",\n" +
                "    \"type\": \"MEMCACHED\",\n" +
                "    \"content\": \"5d1e1de680846a307c9874dc3d6878dc\"\n" +
                "   },\n" +
                "   \"query\": {\n" +
                "    \"execution-start-time\": \"5\",\n" +
                "    \"execution-stop-time\": \"7\",\n" +
                "    \"execution-time\": \"2\",\n" +
                "    \"params\": \"{url=[http://download.finance.yahoo.com/d/quotes.csv?f=aa2bb2b3b4cc1c3c4c6c8dd1d2ee1e7e8e9ghjkg1g3g4g5g6ii5j1j3j4j5j6k1k2k4k5ll1l2l3mm2m3m4m5m6m7m8nn4opp1p2p5p6qrr1r2r5r6r7ss1s7t1t7t8vv1v7ww1w4xy&s=YHOO]}\",\n" +
                "    \"content\": \"select * from csv where url=@url and columns='Ask,AverageDailyVolume,Bid,AskRealtime,BidRealtime,BookValue,Change&PercentChange,Change,Commission,Currency,ChangeRealtime,AfterHoursChangeRealtime,DividendShare,LastTradeDate,TradeDate,EarningsShare,ErrorIndicationreturnedforsymbolchangedinvalid,EPSEstimateCurrentYear,EPSEstimateNextYear,EPSEstimateNextQuarter,DaysLow,DaysHigh,YearLow,YearHigh,HoldingsGainPercent,AnnualizedGain,HoldingsGain,HoldingsGainPercentRealtime,HoldingsGainRealtime,MoreInfo,OrderBookRealtime,MarketCapitalization,MarketCapRealtime,EBITDA,ChangeFromYearLow,PercentChangeFromYearLow,LastTradeRealtimeWithTime,ChangePercentRealtime,ChangeFromYearHigh,PercebtChangeFromYearHigh,LastTradeWithTime,LastTradePriceOnly,HighLimit,LowLimit,DaysRange,DaysRangeRealtime,FiftydayMovingAverage,TwoHundreddayMovingAverage,ChangeFromTwoHundreddayMovingAverage,PercentChangeFromTwoHundreddayMovingAverage,ChangeFromFiftydayMovingAverage,PercentChangeFromFiftydayMovingAverage,Name,Notes,Open,PreviousClose,PricePaid,ChangeinPercent,PriceSales,PriceBook,ExDividendDate,PERatio,DividendPayDate,PERatioRealtime,PEGRatio,PriceEPSEstimateCurrentYear,PriceEPSEstimateNextYear,Symbol,SharesOwned,ShortRatio,LastTradeTime,TickerTrend,OneyrTargetPrice,Volume,HoldingsValue,HoldingsValueRealtime,YearRange,DaysValueChange,DaysValueChangeRealtime,StockExchange,DividendYield'\"\n" +
                "   },\n" +
                "   \"javascript\": {\n" +
                "    \"execution-start-time\": \"3\",\n" +
                "    \"execution-stop-time\": \"14\",\n" +
                "    \"execution-time\": \"10\",\n" +
                "    \"instructions-used\": \"63768\",\n" +
                "    \"table-name\": \"yahoo.finance.quotes\"\n" +
                "   },\n" +
                "   \"user-time\": \"14\",\n" +
                "   \"service-time\": \"2\",\n" +
                "   \"build-version\": \"0.2.31\"\n" +
                "  },\n" +
                "  \"results\": {\n" +
                "   \"quote\": {\n" +
                "    \"symbol\": \"YHOO\",\n" +
                "    \"Ask\": \"37.68\",\n" +
                "    \"AverageDailyVolume\": \"12650900\",\n" +
                "    \"Bid\": \"37.64\",\n" +
                "    \"AskRealtime\": null,\n" +
                "    \"BidRealtime\": null,\n" +
                "    \"BookValue\": \"30.03\",\n" +
                "    \"Change_PercentChange\": \"-0.24 - -0.63%\",\n" +
                "    \"Change\": \"-0.24\",\n" +
                "    \"Commission\": null,\n" +
                "    \"Currency\": \"USD\",\n" +
                "    \"ChangeRealtime\": null,\n" +
                "    \"AfterHoursChangeRealtime\": null,\n" +
                "    \"DividendShare\": null,\n" +
                "    \"LastTradeDate\": \"7/15/2016\",\n" +
                "    \"TradeDate\": null,\n" +
                "    \"EarningsShare\": \"-4.76\",\n" +
                "    \"ErrorIndicationreturnedforsymbolchangedinvalid\": null,\n" +
                "    \"EPSEstimateCurrentYear\": \"0.50\",\n" +
                "    \"EPSEstimateNextYear\": \"0.58\",\n" +
                "    \"EPSEstimateNextQuarter\": \"0.14\",\n" +
                "    \"DaysLow\": \"37.68\",\n" +
                "    \"DaysHigh\": \"38.19\",\n" +
                "    \"YearLow\": \"26.15\",\n" +
                "    \"YearHigh\": \"39.98\",\n" +
                "    \"HoldingsGainPercent\": null,\n" +
                "    \"AnnualizedGain\": null,\n" +
                "    \"HoldingsGain\": null,\n" +
                "    \"HoldingsGainPercentRealtime\": null,\n" +
                "    \"HoldingsGainRealtime\": null,\n" +
                "    \"MoreInfo\": null,\n" +
                "    \"OrderBookRealtime\": null,\n" +
                "    \"MarketCapitalization\": \"35.80B\",\n" +
                "    \"MarketCapRealtime\": null,\n" +
                "    \"EBITDA\": \"245.44M\",\n" +
                "    \"ChangeFromYearLow\": \"11.57\",\n" +
                "    \"PercentChangeFromYearLow\": \"+44.24%\",\n" +
                "    \"LastTradeRealtimeWithTime\": null,\n" +
                "    \"ChangePercentRealtime\": null,\n" +
                "    \"ChangeFromYearHigh\": \"-2.26\",\n" +
                "    \"PercebtChangeFromYearHigh\": \"-5.65%\",\n" +
                "    \"LastTradeWithTime\": \"4:00pm - <b>37.72</b>\",\n" +
                "    \"LastTradePriceOnly\": \"37.72\",\n" +
                "    \"HighLimit\": null,\n" +
                "    \"LowLimit\": null,\n" +
                "    \"DaysRange\": \"37.68 - 38.19\",\n" +
                "    \"DaysRangeRealtime\": null,\n" +
                "    \"FiftydayMovingAverage\": \"37.20\",\n" +
                "    \"TwoHundreddayMovingAverage\": \"34.39\",\n" +
                "    \"ChangeFromTwoHundreddayMovingAverage\": \"3.33\",\n" +
                "    \"PercentChangeFromTwoHundreddayMovingAverage\": \"+9.67%\",\n" +
                "    \"ChangeFromFiftydayMovingAverage\": \"0.52\",\n" +
                "    \"PercentChangeFromFiftydayMovingAverage\": \"+1.39%\",\n" +
                "    \"Name\": \"Yahoo! Inc.\",\n" +
                "    \"Notes\": null,\n" +
                "    \"Open\": \"38.16\",\n" +
                "    \"PreviousClose\": \"37.96\",\n" +
                "    \"PricePaid\": null,\n" +
                "    \"ChangeinPercent\": \"-0.63%\",\n" +
                "    \"PriceSales\": \"7.46\",\n" +
                "    \"PriceBook\": \"1.26\",\n" +
                "    \"ExDividendDate\": null,\n" +
                "    \"PERatio\": null,\n" +
                "    \"DividendPayDate\": null,\n" +
                "    \"PERatioRealtime\": null,\n" +
                "    \"PEGRatio\": \"-330.09\",\n" +
                "    \"PriceEPSEstimateCurrentYear\": \"75.44\",\n" +
                "    \"PriceEPSEstimateNextYear\": \"65.03\",\n" +
                "    \"Symbol\": \"YHOO\",\n" +
                "    \"SharesOwned\": null,\n" +
                "    \"ShortRatio\": \"2.59\",\n" +
                "    \"LastTradeTime\": \"4:00pm\",\n" +
                "    \"TickerTrend\": null,\n" +
                "    \"OneyrTargetPrice\": \"40.94\",\n" +
                "    \"Volume\": \"13500086\",\n" +
                "    \"HoldingsValue\": null,\n" +
                "    \"HoldingsValueRealtime\": null,\n" +
                "    \"YearRange\": \"26.15 - 39.98\",\n" +
                "    \"DaysValueChange\": null,\n" +
                "    \"DaysValueChangeRealtime\": null,\n" +
                "    \"StockExchange\": \"NMS\",\n" +
                "    \"DividendYield\": null,\n" +
                "    \"PercentChange\": \"-0.63%\"\n" +
                "   }\n" +
                "  }\n" +
                " }\n" +
                "}";
        JsonElement jsonParser = new JsonParser().parse(response);
        JsonObject jsonObject = jsonParser.getAsJsonObject();
        jsonObject = jsonObject.getAsJsonArray("items").get(0).getAsJsonObject();
        jsonObject = jsonObject.getAsJsonObject("message");
        int dou = jsonObject.get("user_id").getAsInt();

        System.out.println(dou);
    }
}