package app.revanced.patches.youtube.layout.widesearchbar.fingerprints

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.annotation.MatchingMethod
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import app.revanced.patches.youtube.layout.widesearchbar.annotations.WideSearchbarCompatibility
import org.jf.dexlib2.AccessFlags

@Name("wide-searchbar-methodtwo-parent-fingerprint")
@MatchingMethod(
    "Lkrf;", "i"
)
@WideSearchbarCompatibility
@Version("0.0.1")

/*
This finds following method:
public static ies i(br brVar) {
        bp f = brVar.getSupportFragmentManager().f("VIDEO_QUALITIES_QUICK_MENU_BOTTOM_SHEET_FRAGMENT");
        if (f != null) {
            return (kga) f;
        }
        return new kga();
    }
 */

object WideSearchbarTwoParentFingerprint : MethodFingerprint(
    "L", AccessFlags.PUBLIC or AccessFlags.STATIC, listOf("L"), null,
    listOf("VIDEO_QUALITIES_QUICK_MENU_BOTTOM_SHEET_FRAGMENT")
)