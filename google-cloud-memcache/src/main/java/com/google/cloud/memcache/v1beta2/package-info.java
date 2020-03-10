/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud Memorystore for Memcached API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>=================== CloudMemcacheClient ===================
 *
 * <p>Service Description: Configures and manages Cloud Memorystore for Memcached instances.
 *
 * <p>The `memcache.googleapis.com` service implements the Google Cloud Memorystore for Memcached
 * API and defines the following resource model for managing Memorystore Memcached (also called
 * Memcached below) instances: &#42; The service works with a collection of cloud projects, named:
 * `/projects/&#42;` &#42; Each project has a collection of available locations, named:
 * `/locations/&#42;` &#42; Each location has a collection of Memcached instances, named:
 * `/instances/&#42;` &#42; As such, Memcached instances are resources of the form:
 * `/projects/{project_id}/locations/{location_id}/instances/{instance_id}`
 *
 * <p>Note that location_id must be refering to a GCP `region`; for example: &#42;
 * `projects/my-memcached-project/locations/us-central1/instances/my-memcached`
 *
 * <p>Sample for CloudMemcacheClient:
 *
 * <pre>
 * <code>
 * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
 *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
 *   Instance response = cloudMemcacheClient.getInstance(name);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.memcache.v1beta2;

import javax.annotation.Generated;
