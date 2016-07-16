/*
 * SWGSuccessTickerResponse.h
 * 
 * 
 */

#ifndef SWGSuccessTickerResponse_H_
#define SWGSuccessTickerResponse_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGSuccessTickerResponse: public SWGObject {
public:
    SWGSuccessTickerResponse();
    SWGSuccessTickerResponse(QString* json);
    virtual ~SWGSuccessTickerResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccessTickerResponse* fromJson(QString &jsonString);

    qint64 getLastPrice();
    void setLastPrice(qint64 lastPrice);
qint64 getTimestamp();
    void setTimestamp(qint64 timestamp);
qint64 getBid();
    void setBid(qint64 bid);
qint64 getAsk();
    void setAsk(qint64 ask);
qint64 getFiatVolume();
    void setFiatVolume(qint64 fiatVolume);
qint64 getCoinVolume();
    void setCoinVolume(qint64 coinVolume);
qint64 getOpen();
    void setOpen(qint64 open);
qint64 getHigh();
    void setHigh(qint64 high);
qint64 getLow();
    void setLow(qint64 low);

private:
    qint64 lastPrice;
qint64 timestamp;
qint64 bid;
qint64 ask;
qint64 fiatVolume;
qint64 coinVolume;
qint64 open;
qint64 high;
qint64 low;
};

} /* namespace Swagger */

#endif /* SWGSuccessTickerResponse_H_ */
