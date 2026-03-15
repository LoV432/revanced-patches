package app.revanced.patches.nzb360.pro

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patcher.extensions.addInstructions
import app.revanced.com.android.tools.smali.dexlib2.mutable.MutableMethod

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Unlock Pro",
) {
    compatibleWith("com.kevinforeman.nzb360")

    apply {
        isUnlockedFingerprint.mutableMethod.addInstructions(
            0,
            """
            const/4 v0, 0x1
            return v0
            """
        )
    }
}