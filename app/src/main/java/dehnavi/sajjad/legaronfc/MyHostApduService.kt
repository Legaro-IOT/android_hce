package dehnavi.sajjad.legaronfc

import android.nfc.cardemulation.HostApduService
import android.os.Bundle
import android.util.Log

class MyHostApduService : HostApduService() {
    override fun processCommandApdu(commandApdu: ByteArray, extras: Bundle?): ByteArray {
        Log.d("HCE", "processCommandApdu")
        Log.d("HCE", commandApdu.contentToString())
        return "HELLO".toByteArray()
    }

    override fun onDeactivated(reason: Int) {
        //implement deactivated service
    }
}
