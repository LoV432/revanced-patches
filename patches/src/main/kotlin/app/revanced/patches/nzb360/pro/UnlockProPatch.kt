package app.revanced.patches.nzb360.pro

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patcher.util.smali.toInstruction

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Unlock Pro",
) {
    compatibleWith("com.kevinforeman.nzb360")

    execute {
        isUnlockedFingerprint.addInstructions(
            0,
            """
            const/4 v0, 0x1
            return v0
            """
        )
    }
}