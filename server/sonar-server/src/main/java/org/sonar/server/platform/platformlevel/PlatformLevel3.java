/*
 * SonarQube
 * Copyright (C) 2009-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.server.platform.platformlevel;

import org.sonar.api.utils.UriReader;
import org.sonar.core.util.DefaultHttpDownloader;
import org.sonar.server.db.CheckDatabaseCharsetAfterMigration;
import org.sonar.server.platform.PersistentSettings;
import org.sonar.server.platform.ServerIdGenerator;
import org.sonar.server.platform.ServerIdLoader;
import org.sonar.server.startup.ServerMetadataPersister;

public class PlatformLevel3 extends PlatformLevel {
  public PlatformLevel3(PlatformLevel parent) {
    super("level3", parent);
  }

  @Override
  protected void configureLevel() {
    add(
      CheckDatabaseCharsetAfterMigration.class,
      PersistentSettings.class,
      ServerMetadataPersister.class,
      DefaultHttpDownloader.class,
      UriReader.class,
      ServerIdLoader.class,
      ServerIdGenerator.class);
  }
}
