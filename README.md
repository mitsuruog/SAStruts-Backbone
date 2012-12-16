SAStruts-Backbone
=================

SAStruts+Backbone.jsのプロトタイプ

できること
------
+ Sync先のURLとActionの連携
+ Bacbone.Syncの以下のRESTメソッド
 - GET : JSONでのレスポンス 
 - POST : リクエストパラメータの受け渡し

やりたいこと
------
+ SAStrutsのアノテーションバリデータのエラー検出時にJSONでメッセージを返す。
 - （補足）検証メソッドはActionMessagesThrowsInterceptorをDIすればOK。
+ Bacbone.Syncの以下のRESTメソッド
 - PUT
