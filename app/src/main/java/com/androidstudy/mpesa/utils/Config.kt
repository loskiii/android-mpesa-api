/*
 * Copyright 2021 Juma Allan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.androidstudy.mpesa.utils

import com.androidstudy.daraja.util.TransactionType

object Config {
    var CONSUMER_KEY = "Uku3wUhDw9z0Otdk2hUAbGZck8ZGILyh"
    var CONSUMER_SECRET = "JDjpQBm5HpYwk38b"
    var CALLBACK_URL = "http://mycallbackurl.com/checkout.php"
    var BUSINESS_SHORTCODE = "174379"
    var ACCOUNT_TYPE = TransactionType.CustomerBuyGoodsOnline
}