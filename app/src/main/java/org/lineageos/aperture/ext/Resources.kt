/*
 * SPDX-FileCopyrightText: 2022 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.aperture.ext

import android.content.Context
import android.content.res.Resources
import org.lineageos.aperture.utils.RROResources

internal fun Resources.getBoolean(context: Context, id: Int): Boolean {
    RROResources.getAutoGeneratedRROResources(context).forEach {
        runCatching {
            return it.getBoolean(id)
        }
    }
    return getBoolean(id)
}

internal fun Resources.getStringArray(context: Context, id: Int): Array<String> {
    RROResources.getAutoGeneratedRROResources(context).forEach {
        runCatching {
            return it.getStringArray(id)
        }
    }
    return getStringArray(id)
}
