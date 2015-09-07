/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.client.dsl.internal;

import io.fabric8.kubernetes.client.dsl.ClientResource;
import io.fabric8.kubernetes.client.dsl.CreateFromLoadable;
import io.fabric8.openshift.api.model.DoneableUser;
import io.fabric8.openshift.api.model.User;
import io.fabric8.openshift.api.model.UserList;
import io.fabric8.openshift.client.OpenShiftClient;

public class UserOperationsImpl extends OpenshiftOperation<OpenShiftClient, User, UserList, DoneableUser, ClientResource<User, DoneableUser>, CreateFromLoadable<User, DoneableUser>> {
  public UserOperationsImpl(OpenShiftClient client) {
    super(client, "users", null, null, true);
  }

  public UserOperationsImpl(OpenShiftClient client, String namespace, String name, Boolean cascading) {
    super(client, "users", namespace, name, cascading);
  }
}