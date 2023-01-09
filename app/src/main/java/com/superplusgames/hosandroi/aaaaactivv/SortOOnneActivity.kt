package com.superplusgames.hosandroi.aaaaactivv


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandroi.R
import com.superplusgames.hosandroi.aaaaactivv.gaame.GgggggameActivity
import com.superplusgames.hosandroi.aaaaactivv.sssorot.SortTviiiActivity
import com.superplusgames.hosandroi.ottther.Saaasha.MAIN_IDffrrfrrfgtggtgt5
import com.superplusgames.hosandroi.ottther.Saaasha.appsCheckfrr6656565
import com.superplusgames.hosandroi.ottther.Saaasha.countryCodefrrfrfrfrrfgt5tg5gt56
import com.superplusgames.hosandroi.ottther.Saaasha.geomeogtgtgtgtgt5
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SortOOnneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort_oonne)
        huggtughgt()
    }

    private fun yhyhjujujujujujuju() {
        val gthyhyjujukikikiik = Intent(this@SortOOnneActivity, GgggggameActivity::class.java)
        gktgjtigijtjgt()
        startActivity(gthyhyjujukikikiik)
        finish()
    }

    private fun gktgjtigijtjgt() {
        Hawk.put(geomeogtgtgtgtgt5, null)
        Hawk.put(countryCodefrrfrfrfrrfgt5tg5gt56, null)
        Hawk.put(appsCheckfrr6656565, null)
    }

    private fun vfgbgnhnhnhhnnhnnh(): String? {
        val ykokjouokjujuj: String? = Hawk.get(appsCheckfrr6656565)
        return ykokjouokjujuj
    }

    private fun huggtughgt() {
        val yhjyijhjijhyjiyh = vfgbgnhnhnhhnnhnnh()

        if (yhjyijhjijhyjiyh == "0") {
            yhyhjujujujujujuju()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                uokjkoukjkukkjui()
            }
            vbfvhbfbvbfvhbfvbvfb()
        }
    }

    private fun uokjkoukjkukkjui() {
        val gtgttadInfo = AdvertisingIdClient(applicationContext)
        gtgttadInfo.start()
        val adIdInfofrrrf = gtgttadInfo.info.id
        Hawk.put(MAIN_IDffrrfrrfgtggtgt5, adIdInfofrrrf)
    }

    private fun vbfvhbfbvbfvhbfvbvfb() {
        val hyhyyhyhy = Intent(this@SortOOnneActivity, SortTviiiActivity::class.java)
        startActivity(hyhyyhyhy)
        finish()
    }

}