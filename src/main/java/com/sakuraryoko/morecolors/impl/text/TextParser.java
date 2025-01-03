/*
 * This file is part of the MoreColorAPI project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2024  Sakura Ryoko and contributors
 *
 * MoreColorAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MoreColorAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with MoreColorAPI.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sakuraryoko.morecolors.impl.text;

import org.jetbrains.annotations.ApiStatus;

//#if MC >= 12006
//$$ import eu.pb4.placeholders.api.parsers.NodeParser;

//$$ @ApiStatus.Internal
//$$ public class TextParser
//$$ {
    //$$ public static NodeParser LEGACY;
    //$$ public static NodeParser SIMP;
    //$$ public static NodeParser QUICK;
    //$$ public static NodeParser PLACEHOLDER;
    //$$ public static NodeParser PARSE;

    //$$ public static void build()
    //$$ {
        //$$ LEGACY = NodeParser.builder().legacyAll().build();
        //$$ SIMP = NodeParser.builder().simplifiedTextFormat().build();
        //$$ QUICK = NodeParser.builder().quickText().build();
        //$$ PLACEHOLDER = NodeParser.builder().globalPlaceholders().build();

        //$$ PARSE = NodeParser.builder().add(LEGACY).add(SIMP).add(QUICK).build();
    //$$ }
//$$ }
//#else
@ApiStatus.Internal
public class TextParser
{
}
//#endif