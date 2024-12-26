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

package com.sakuraryoko.morecolors.api;

import javax.annotation.Nonnull;

import com.sakuraryoko.morecolors.api.commands.IServerCommand;
import com.sakuraryoko.morecolors.api.config.IConfigDispatch;
import com.sakuraryoko.morecolors.api.events.IClientEventsDispatch;
import com.sakuraryoko.morecolors.api.events.IPlayerEventsDispatch;
import com.sakuraryoko.morecolors.api.events.IServerEventsDispatch;
import com.sakuraryoko.morecolors.api.modinit.IModInitDispatcher;
import com.sakuraryoko.morecolors.coreimpl.CoreLib;
import com.sakuraryoko.morecolors.coreimpl.commands.CommandManager;
import com.sakuraryoko.morecolors.coreimpl.config.ConfigManager;
import com.sakuraryoko.morecolors.coreimpl.events.client.ClientEventsManager;
import com.sakuraryoko.morecolors.coreimpl.events.players.PlayerEventsManager;
import com.sakuraryoko.morecolors.coreimpl.events.server.ServerEventsManager;
import com.sakuraryoko.morecolors.coreimpl.modinit.ModInitManager;

public interface CoreLibAPI
{
    class ModInit
    {
        static boolean registerModInitHandler(@Nonnull IModInitDispatcher dispatch)
        {
            try
            {
                ModInitManager.getInstance().registerModInitHandler(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using registerModInitHandler() --> {}", err.getMessage());
            }

            return false;
        }
    }

    class Config
    {
        static boolean registerConfigDispatch(@Nonnull IConfigDispatch dispatch)
        {
            try
            {
                ConfigManager.getInstance().registerConfigDispatcher(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using registerConfigDispatch() --> {}", err.getMessage());
            }

            return false;
        }

        static void initAllConfigs()
        {
            ConfigManager.getInstance().initAllConfigs();
        }

        static void defaultAllConfigs()
        {
            ConfigManager.getInstance().defaultAllConfigs();
        }

        static void loadAllConfigs()
        {
            ConfigManager.getInstance().loadAllConfigs();
        }

        static void saveAllConfigs()
        {
            ConfigManager.getInstance().saveAllConfigs();
        }

        static void reloadAllConfigs()
        {
            ConfigManager.getInstance().reloadAllConfigs();
        }

        static boolean initEachConfig(@Nonnull IConfigDispatch dispatch)
        {
            try
            {
                ConfigManager.getInstance().initEach(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using initEachConfig() --> {}", err.getMessage());
            }

            return false;
        }

        static boolean defaultEachConfig(@Nonnull IConfigDispatch dispatch)
        {
            try
            {
                ConfigManager.getInstance().defaultEach(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using defaultEachConfig() --> {}", err.getMessage());
            }

            return false;
        }

        static boolean loadEachConfig(@Nonnull IConfigDispatch dispatch)
        {
            try
            {
                ConfigManager.getInstance().loadEach(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using loadEachConfig() --> {}", err.getMessage());
            }

            return false;
        }

        static boolean saveEachConfig(@Nonnull IConfigDispatch dispatch)
        {
            try
            {
                ConfigManager.getInstance().saveEach(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using saveEachConfig() --> {}", err.getMessage());
            }

            return false;
        }

        static boolean reloadEachConfig(@Nonnull IConfigDispatch dispatch)
        {
            try
            {
                ConfigManager.getInstance().reloadEach(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using reloadEachConfig() --> {}", err.getMessage());
            }

            return false;
        }
    }

    class Commands
    {
        static boolean registerServerCommand(@Nonnull IServerCommand command)
        {
            try
            {
                CommandManager.getInstance().registerCommandHandler(command);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using registerServerCommand() --> {}", err.getMessage());
            }

            return false;
        }
    }

    class Events
    {
        static boolean registerClientEventsDispatcher(IClientEventsDispatch dispatch)
        {
            try
            {
                ClientEventsManager.getInstance().registerClientEvents(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using registerClientEventsDispatcher() --> {}", err.getMessage());
            }

            return false;
        }

        static boolean registerServerEventsDispatcher(IServerEventsDispatch dispatch)
        {
            try
            {
                ServerEventsManager.getInstance().registerEventDispatcher(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using registerServerEventsDispatcher() --> {}", err.getMessage());
            }

            return false;
        }

        static boolean registerPlayerEventsDispatcher(IPlayerEventsDispatch dispatch)
        {
            try
            {
                PlayerEventsManager.getInstance().registerPlayerEvents(dispatch);
                return true;
            }
            catch (RuntimeException err)
            {
                CoreLib.LOGGER.error("RuntimeException using registerPlayerEventsDispatcher() --> {}", err.getMessage());
            }

            return false;
        }
    }
}
