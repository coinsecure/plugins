/*
 * SWGBidID.h
 * 
 * 
 */

#ifndef SWGBidID_H_
#define SWGBidID_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGBidID: public SWGObject {
public:
    SWGBidID();
    SWGBidID(QString* json);
    virtual ~SWGBidID();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGBidID* fromJson(QString &jsonString);

    QString* getBidID();
    void setBidID(QString* bidID);

private:
    QString* bidID;
};

} /* namespace Swagger */

#endif /* SWGBidID_H_ */
